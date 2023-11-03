package hw03;
abstract class Employee {
    String name, phone, acc;
    Employee(String name, String phone, String acc){
        this.name = name; this.phone = phone; this.acc = acc;
    }
    abstract int GetPay();
}
class Permanent extends Employee {
    int salary;
    Permanent(String name, String phone, String acc, int salary){
        super(name, phone, acc);
        this.salary = salary;
    }
    int GetPay(){
        return this.salary;
    }
}
class Temporary extends Employee {
    int time, pay;
    Temporary(String name, String phone, String acc, int time, int pay){
        super(name, phone, acc);
        this.time = time; this.pay = pay;
    }
    int GetPay(){
        return this.time * this.pay;
    }
}
abstract class Character {
    String id;
    int hp, mp;
    Character(String id, int hp, int mp){
        this.id = id; this.hp = hp; this.mp = mp;
    }
    abstract  void showAccountInfo();
}
class Magician extends Character {
    int int_stats;
    Magician(String id, int hp, int mp, int int_stats){
        super(id, hp, mp);
        this.int_stats = int_stats;
    }
    void showAccountInfo(){
        System.out.printf("[Magician] ID : (%s) / HP : (%d) / MP : (%d) / int_stats : (%d)\n", this.id, this.hp, this.mp, this.int_stats);
        return;
    }
}
class Warrior extends Character {
    int str_stats;
    Warrior(String id, int hp, int mp, int str_stats){
        super(id, hp, mp);
        this.str_stats = str_stats;
        return;
    }
    void showAccountInfo(){
        System.out.printf("[Warrior] ID : (%s) / HP : (%d) / MP : (%d) / str_stats : (%d)\n", this.id, this.hp, this.mp, this.str_stats);
        return;
    }
}
class JobManager {
    Character[] acc;
    int acc_account;
    JobManager(int account_count) {
        this.acc = new Character[account_count];
        this.acc_account = 0;
    }
    void registerCharacter(Character ch){
        this.acc[this.acc_account++] = ch;
        return;
    }
    void showAllAccountInfo(){
        for(int i=0; i < this.acc_account; i++){
            this.acc[i].showAccountInfo();
        }
        return;
    }
}
public class hw03 {
    public static void main(String[] args){
        Employee emp1 = new Permanent("유승호", "01071201936", "2194020413302", 3000000);
        Employee emp2 = new Temporary("유승락", "01071201936", "2194020413303", 192, 9000);
        System.out.println(emp1.GetPay());
        System.out.println(emp2.GetPay());
        JobManager jm = new JobManager(10);
        jm.registerCharacter(new Warrior("공격수1", 10000, 2000, 99));
        jm.registerCharacter(new Magician("마법사1", 2000, 10000, 99));
        jm.registerCharacter(new Warrior("전사의추억", 10000, 2000, 99));
        jm.registerCharacter(new Magician("마법의힘", 2000, 10000, 99));
        jm.registerCharacter(new Warrior("진격의검사", 10000, 2000, 99));
        jm.registerCharacter(new Magician("주술술사줘", 2000, 10000, 99));
        jm.showAllAccountInfo();
        return;
    }
}
