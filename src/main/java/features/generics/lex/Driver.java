package features.generics.lex;

public class Driver {
    public static void updateRecord(Record<? extends Student> record){
        for (int i = 0; i < Data.list.size(); i++) {
            int id = record.getId();
            if (++i == id){
                Data.updateRecord(record);
                break;
            }
        }
    }

    public static void UpdateStudentRecord(Record record){
        System.out.println(record.getType());
    }
    public static void main(String[] args) {

        Data.showAll();
        Record<String> record = new Record<>(4,"Debayan");
        Data.insertRecord(record);
        Data.showAll();
        record.setType("Morgan");
        Data.updateRecord(record);
        Data.showAll();

        Record<?> record2 = Data.getRecord(2);
        System.out.println("Record: " + record);

        Student student01 = new DayScholar("Mohan");
        Record<Student> record1 = new Record<>(5, student01);
        Data.insertRecord(record1);
        Data.showAll();
        student01.setName("Trisha");
        updateRecord(record1);
        Data.showAll();
        Record<String> newRecord = new Record<>(6, "Paul");
        Data.insertRecord(newRecord);
        Data.showAll();
        Employee emp = new Employee("Dell");
        Record<Employee> employeeRecord = new Record<>(7, emp);
        Data.insertRecord(employeeRecord);
        Data.showAll();
    }
}
