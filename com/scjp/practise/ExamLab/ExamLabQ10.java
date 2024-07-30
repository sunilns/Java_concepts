package ExamLab;


	interface Min{}
    
      class Z{  }
      class D implements Min{}
      class B extends Z implements Min{}
    
      class C extends B{}
    
      public class ExamLabQ10{
        public static void main(String args[]){
             Z a=new Z();
             B b=new B();
             C c=new C();
             D d = new D();
             Min m=new C(); 
             b=(C)m;
             //m=(Min)b;
             Z a2=(Z)m;
             //Z a2=(Z)d;
             B b2=(B)a2;
             Min m2=(C)b2;
             C c2=(C)m2;
        }
   }
