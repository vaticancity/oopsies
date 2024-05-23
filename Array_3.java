public class Array_3 {
    
    public static void main(String[] args) {
        double[] salaries = {23500.0, 25080.0, 28760.0, 22340.0, 19890.0};
        double[] result = findDetails(salaries);
        
        System.out.println("Average salary: " + result[0]);
        System.out.println("Number of salaries greater than the average salary: " + result[1]);
        System.out.println("Number of salaries lesser than the average salary: " + result[2]);
    }
    
    public static double[] findDetails(double[] salaries) {
        double total = 0.0;
        for (double salary : salaries) {
            total += salary;
        }
        double average = total / salaries.length;
        
        int greaterCount = 0;
        int lesserCount = 0;
        
        for (double salary : salaries) {
            if (salary > average) {
                greaterCount++;
            } else if (salary < average) {
                lesserCount++;
            }
        }
        
        return new double[] {average, greaterCount, lesserCount};
    }
}
