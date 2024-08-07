// Michael Roy

abstract class Employee {
   private String m_name;
   private String m_department;

   public Employee(String name, String department) {
      m_name = name;
      m_department = department;
   }

   public String getName() {
      return m_name;
   }

   public String getDepartment() {
      return m_department;
   }

   public abstract String getPaycheck();
}