public class DataStructures {

  public static void main (String args[]) {

    //1
    List<Cat> catsList= new ArrayList();
    catsList.add(new Cat("one"));
    catsList.add(new Cat("two"));
    catsList.add(new Cat("three"));
    catsList.add(new Cat("four"));
    catsList.add(new Cat("five"));

    for (int i = 0; i < catsList.size(); i++) {
      System.out.println(catsList.get(i).getName());
    }
  }

  //2
  public void mostFrequentElement(ArrayList<Integer> numList){
    List<Integer> count= new ArrayList<Integer>();
    List<Integer> seen = new ArrayList<Integer>();
    int highestnum=0;
    for (int i = 0; i < numList.size() ; i++) {
      if (!seen.contains(numList.get(i))) {
        seen.add(numList.get(i));
        count.add(1);
      } else {
        int index= 0;
        index= seen.indexOf(numList.get(i));
        count.set(index, count.get(index)+ 1);

        if(count.get(index) >= count.get(highestnum)) {
          highestnum= index;
        }
      }
    }
    System.out.println("The most frequent element is " + seen.get(highestnum) + " occurs " + count.get(highestnum) + " times.");
  }

  //2 Bonus Challenge
  public void mostFrequentElement2(ArrayList<String> stringList){
    List<Integer> count= new ArrayList<Integer>();
    List<String> seen = new ArrayList<String>();
    int highestnum=0;
    for (int i = 0; i < stringList.size() ; i++) {
      if (!seen.contains(stringList.get(i))){
        seen.add(stringList.get(i));
        count.add(1);
      } else {
        int index= 0;
        index= seen.indexOf(stringList.get(i));
        count.set(index,count.get(index) + 1);

        if (count.get(index) >= count.get(highestnum)){
          highestnum= index;
        }
      }
    }
    System.out.println("The most frequent element " + seen.get(highestnum)
            + " occurs " + count.get(highestnum) + " times");
  }

  //3
  public void printYourSquadMates(){
    Map<String, Integer> pod = new HashMap<String, Integer>();
    pod.put("Muaddh", 18);
    pod.put("Yisandy", 21);
    pod.put("Darnell", 26);
    pod.put("Yoki", 24);
    pod.put("Wayne", 25);
    pod.put("Angel", 2);

    for (Map.Entry<String, Integer> entry: pod.entrySet()) {
      System.out.println(entry.getKey() + " is age " + entry.getValue() + ".");
    }
  }

  //4
  public boolean canRentACar(HashMap<String, Integer> pod){
    for (Map.Entry<String, Integer> entry: pod.entrySet()) {
      if (entry.getValue() > 25) return true;
    }
    return false;
  }

  //5
  public ArrayList<String> wordsWithoutList(ArrayList<String> strings, int n) {
    ArrayList<String> newList= new ArrayList<String>();
    for (int i = 0; i < strings.size(); i++) {
      if (strings.get(i).length() != n) {
        newList.add(strings.get(i));
      }
    }
    return newList;
  }

  //6
  public static int countClumps(int[] nums) {
    int clumps = 0;
    boolean isClump = false;
    for(int i = 0; i < nums.length - 1; i++) {
      if(isClump) {
        if(nums[i] != nums[i+1])
          isClump = false;
      }
      else if(nums[i] == nums[i+1]) {
        isClump = true;
        clumps++;
      }
    }
    return clumps;
  }

  //7
  public void printStringInAlphaOrder(String s){
    List<Character> strings= new ArrayList<Character>();
    for (int i = 0; i < s.length(); i++) {
      strings.add(s.toLowerCase().charAt(i));
      System.out.println(strings);
    }
    Collections.sort(strings);
    System.out.println(strings);
  }


}
