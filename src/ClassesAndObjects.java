/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

    public static void main(String args[]) {

        //1
        Cat catOne = new Cat("Garfield");
        Cat catTwo = new Cat("Panther");
        Cat catThree = new Cat("Catwoman");

        catOne.setFavoriteFood("Lasagna");
        catTwo.setFavoriteFood("Hamburger");
        catThree.setFavoriteFood("Pizza");

        catOne.setAge(2);
        catTwo.setAge(5);
        catThree.setAge(1);

        System.out.println(isOlder(catTwo, catOne));
        bestFriends(catTwo, catThree);
        System.out.println(kitten(catOne, catTwo));

        Person girl = new Person("Carla");
        adoption(catOne, girl);
        catTwo.setOwner(girl);
        System.out.println(isSibling(catOne, catTwo));
        System.out.println(isFree(catThree));

    }

    //2
    public static boolean isOlder(Cat one, Cat two) {
        return one.getAge() > two.getAge();
    }

    //3
    public static void bestFriends(Cat one, Cat two) {
        if (one.getFavoriteFood().equals(two.getFavoriteFood())) {
            System.out.println(one.getName() + " and " + two.getName() + " are best friends.");
        } else {
            System.out.println("They are not best friends.");
        }
    }

    //4
    public static String kitten(Cat one, Cat two) {
        String kittenName = one.getName() + two.getName();
        Cat kitten = new Cat(kittenName);
        kitten.setAge(0);
        String result = "a Cat named " + kittenName + " with age 0 ";
        return result;
    }

    //5 + bonus
    public static void adoption(Cat cat, Person person) {
        if (cat.getName().equals("Catwoman")) {
            System.out.println("Catwoman will never be anyone's pet!");
        } else {
            cat.setOwner(person);
            System.out.println(person.getName() + " is now " + cat.getName() + "'s owner.");
        }
    }

    //6
    public static boolean isFree(Cat cat) {
        return cat.getOwner() == null;
    }

    //7
    public static boolean isSibling(Cat one, Cat two) {
        return one.getOwner().equals(two.getOwner());
    }
}
