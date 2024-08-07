// The Faculty class that inherits from the Employee class
// Michael Roy

class Faculty extends Employee {
  private int m_salary;

  public Faculty(String name, String department, int salary) {
    super(name, department);
    m_salary = salary;
  }

  @Override
  public String getPaycheck() {
    return String.format("%s-%s-$%d", this.getName(), this.getDepartment(), m_salary);
  }

}