// Last updated: 9/17/2025, 11:56:45 PM

class FoodRatings {
    private Map<String, String> foodToCuisine;
    private Map<String, Integer> foodToRating;
    private Map<String, PriorityQueue<Food>> cuisineToPQ;

    // Inner class to hold food+rating
    private static class Food {
        String name;
        int rating;
        Food(String name, int rating) {
            this.name = name;
            this.rating = rating;
        }
    }

    public FoodRatings(String[] foods, String[] cuisines, int[] ratings) {
        foodToCuisine = new HashMap<>();
        foodToRating = new HashMap<>();
        cuisineToPQ = new HashMap<>();

        for (int i = 0; i < foods.length; i++) {
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];

            foodToCuisine.put(food, cuisine);
            foodToRating.put(food, rating);

            cuisineToPQ
                .computeIfAbsent(cuisine, k -> new PriorityQueue<>(
                    (a, b) -> a.rating != b.rating
                                ? b.rating - a.rating   // higher rating first
                                : a.name.compareTo(b.name) // lexicographically smaller first
                ))
                .add(new Food(food, rating));
        }
    }

    public void changeRating(String food, int newRating) {
        foodToRating.put(food, newRating);
        String cuisine = foodToCuisine.get(food);
        cuisineToPQ.get(cuisine).add(new Food(food, newRating)); // push updated
    }

    public String highestRated(String cuisine) {
        PriorityQueue<Food> pq = cuisineToPQ.get(cuisine);

        // Lazy cleanup: remove outdated foods
        while (!pq.isEmpty()) {
            Food top = pq.peek();
            if (foodToRating.get(top.name) != top.rating) {
                pq.poll(); // outdated entry
            } else {
                return top.name; // valid top
            }
        }
        return ""; // should never happen
    }
}
