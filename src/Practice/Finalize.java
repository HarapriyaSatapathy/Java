package src.Practice;
import java.lang.Object;

public class Finalize {
    public class JavafinalizeExample1 {
        public void main(String[] args)
        {
            JavafinalizeExample1 obj = new JavafinalizeExample1();
            System.out.println(obj.hashCode());
            obj = null;
            // calling garbage collector
            System.gc();
            System.out.println("end of garbage collection");

        }
        @Override
        protected void finalize()
        {
            System.out.println("finalize method called");
        }
    }

}

