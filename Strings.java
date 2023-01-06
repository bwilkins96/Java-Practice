class Strings {
    public static void main(String[] args) {
        String name = "Hannah"; // ==
        String name2 = new String("Benjamin"); // != name2.equalsIgnoreCase(name4)
        int year = 2022;

        System.out.println(name2 + " and " + name + " were married in " + year + "!");

        // %s - str, %d - int, %f - dec, %c - char, %b - bool
        String formatted = String.format("%s and %s were married in %d!", name, name2, year);
        System.out.println(formatted); 
        
        String name3 = "";
        String name4 = "licorice";

        System.out.println("\n" + name.length());
        System.out.println(name.isEmpty());
        System.out.println(name3.isEmpty());
        System.out.println(name4.toUpperCase());
        System.out.println(name2.toLowerCase());
        System.out.println(name4.replace("l", "L"));
        System.out.println(name2.contains("Ben"));
        
    }
}