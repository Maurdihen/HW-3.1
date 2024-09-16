public class Main {
    public static void main(String[] args) {
        byte personAge = 17;
        System.out.println("Если возраст человека равен " + personAge + ", то");
        if (personAge >= 18) {
            System.out.println("он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println();

        byte outsideTemperature = -10;
        System.out.println("На улице " + outsideTemperature + " градусов");
        if (outsideTemperature < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        System.out.println();

        byte currentSpeed = 120;
        System.out.println("Если скорость " + currentSpeed + ", то");
        if (currentSpeed > 60) {
            System.out.println("придется заплатить штраф");
        } else {
            System.out.println("можно ездить спокойно");
        }
        System.out.println();

        byte childAge = 1;
        System.out.println("Если человеку " + childAge);
        if (childAge < 2) {
            System.out.println("то ему никуда не нужно");
        } else if (childAge <= 6) {
            System.out.println("то ему нужно ходить в детский сад");
        } else if (childAge <= 17) {
            System.out.println("то ему нужно ходить в школу");
        } else if (childAge <= 24) {
            System.out.println("то его место в университете");
        } else {
            System.out.println("то ему пора ходить на работу");
        }
        System.out.println();

        byte amusementAge = 13;
        System.out.println("Если человеку " + amusementAge);
        if (amusementAge <= 5) {
            System.out.println("то он не может кататься на аттракционе");
        } else if (amusementAge <= 14) {
            System.out.println("то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        } else {
            System.out.println("то он может кататься без сопровождения взрослого.");
        }
        System.out.println();

        byte totalSeats = 102;
        byte sittingSeats = 60;
        byte passengers = 80;
        if (passengers >= totalSeats) {
            System.out.println("В вагоне больше нет мест");
        } else if (passengers >= sittingSeats) {
            System.out.println("В вагоне нет сидячих мест, но есть стоячие");
        } else {
            System.out.println("В вагоне есть как стоячие, так и сидячие места");
        }
        System.out.println();

        int numberOne = 1;
        int numberTwo = 2;
        int numberThree = 3;
        if (numberOne >= numberTwo && numberOne >= numberThree) {
            System.out.println("numberOne самое большое число");
        } else if (numberTwo >= numberThree && numberTwo >= numberOne) {
            System.out.println("numberTwo самое большое число");
        } else {
            System.out.println("numberThree самое большое число");
        }
    }
}
