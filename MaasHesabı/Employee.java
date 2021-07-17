package MaasHesabı;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHouse, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHouse;
        this.hireYear = hireYear;
    }
    public int tax(){
        if(salary<1000){return 0;}
        return(int)(salary * 0.03);
    }
    public int bonus(){
            return (workHours-40) *30;
    }

    int raiseSalary(){
        int year = 2021-hireYear;
        if( year < 10 ) return(int)( salary * 0.05 );
        if( year > 9 && year < 20) return (int)( salary *0.10 );
        return(int)( salary *0.15 );
    }
  public String toString(){
        System.out.println("Adı : " + this.name);
        System.out.println("Maaşı : " + this.salary);
        System.out.println("Çalışma Saati : " + this.workHours);
        System.out.println("Başlangıç yılı : " + this.hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş : " + (salary+bonus()-tax()));
        System.out.println("Toplam Maaş : " + (salary+raiseSalary()));
        return null;
  }

}




