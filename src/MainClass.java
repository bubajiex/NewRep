public class MainClass {
    public static void main(String[] args) {

        // пункты 1 - 2

        GenericClass<String> foodType = new GenericClass<String>(new String[]{"Пицца", "Кола"});
        GenericClass<Integer> personAge = new GenericClass<Integer>(new Integer[]{10, 7});
        GenericClass<Double> personWeight = new GenericClass<Double>(new Double[]{1.2, 9.0});


        System.out.println("\n Тип обобщений ");
        foodType.info();
        personAge.info();
        personWeight.info();


        System.out.println("\n Создаем Array List");
        foodType.createArrayList();
        personAge.createArrayList();
        personWeight.createArrayList();


        System.out.println("\n Меняем элементы местами ");
        foodType.changePositionOfElements();
        personAge.changePositionOfElements();
        personWeight.changePositionOfElements();


        //Пункт 3
        Box<Apple> appleBox = new Box<>();
        Apple a1 = new Apple();
        Apple a2 = new Apple();
        Apple a3 = new Apple();


        appleBox.addFruit(a1);
        appleBox.addFruit(a2);
        appleBox.addFruit(a3);


        System.out.println("\n Вес коробки с яблоками " + appleBox.getTotalWeight());


        Box<Orange> orangeBox = new Box<>();
        Orange o1 = new Orange();
        Orange o2 = new Orange();
        Orange o3 = new Orange();


        orangeBox.addFruit(o1);
        orangeBox.addFruit(o2);
        orangeBox.addFruit(o3);


        System.out.println("\n Вес коробки с апельсинами " + orangeBox.getTotalWeight());


        System.out.println("\n Сравним коробки  " + appleBox.compare(orangeBox));


        Box<Apple> newAppleBox = new Box<>();
        appleBox.replaceAllFruitsToOtherBox(newAppleBox);


        Apple a4 = new Apple();
        newAppleBox.addFruit(a4);
        System.out.println("\n Вес коробки с одним яблоком " + newAppleBox.getTotalWeight());
    }
}

