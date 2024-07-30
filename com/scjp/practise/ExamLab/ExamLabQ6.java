package ExamLab;
enum Services{
    Hutch(78),
    Dialog(77),
    Mobitel(71),
    Celtel(72);
    int id=00;
    Services(int n){id=n;}
}

public class ExamLabQ6{
        public static void main(String args[]){
             Object ob=Services.Hutch==Services.valueOf("Hutch");
             System.out.println(ob);
        }
} 