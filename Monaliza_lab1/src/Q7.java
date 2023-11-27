public class Q7 {


        private  String name ;
        private  int age;

        public Q7(String name, int age) {
            this.name = name;
            this.age = age;
        }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Q7{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
       Q7[]students=new Q7[2];
        students[0]=new Q7("moon",20);
        students[1]=new Q7("aya",20);
        for (int i = 0; i < students.length; i++) {
            System.out.println("name: "+students[i].getName());
            System.out.println("age: "+students[i].getAge());
        }

    }
}






