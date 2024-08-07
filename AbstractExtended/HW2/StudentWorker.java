// The StudentWorker class that inherits from the Employee class
// Michael Roy

class StudentWorker extends Employee {
   private int m_hours;
   private int m_hourlyWage;

   public StudentWorker(String name, String department, int hours, int hourlywage) {
      super(name, department);
      m_hours = hours;
      m_hourlyWage = hourlywage;
   }

   @Override
   public String getPaycheck() {
      int paycheck = m_hours * m_hourlyWage;
      return String.format("%s-%s-$%d", this.getName(), this.getDepartment(), paycheck);
   }
}