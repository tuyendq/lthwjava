class WeightChanger {
  public static void main(String[] args) {
    int[] weights = {198, 190, 188, 187, 190, 198, 201, 250, 203, 210, 205, 170, 180, 200, 203, 210, 180};

    // Write down the correct limit for the iterator
    for (int i = 0; i < weights.length; i++) {
      int weight = weights[i];
      if (weight > 220) {
        // Input the correct index to change the list. It should work even if the element changed location.
        weights[i] = 198;
      }
    }

    for (int weight : weights){
      System.out.println(weight);
    }
  }
}