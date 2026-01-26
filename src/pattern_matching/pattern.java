package pattern_matching;

public class pattern {
    public static void main(String[] args) {
        f(21.00f);
        f1(21);
    }

    static void f(Object o){
        if (o instanceof Integer i){
            System.out.println("Integer "+i);
        }
        else if (o instanceof Double d){
            System.out.println("Double "+d);
        }
        else if (o instanceof Float f){
            System.out.println("Float "+f);
        }else if (o instanceof String s){
            System.out.println("String "+s);
        }else{
            System.out.println(o);
        }
    }

    static void f1(Object o){
        System.out.println(
                switch (o){
                    case Integer i -> (i>=100 ? "very big number" : i.toString());
                    case Double d-> d.toString();
                    case Float f-> f.toString();
                    case String s-> s.toString();
                    case null-> "error";
                    default-> o.toString();
            }
        );
    }

    /*static void error(Object o){ // this will generate error due to fall through
        switch (o){
            case Character c:
                if (c.charValue()=='c'){
                    System.out.println("c");
                }
                else{
                    System.out.println("nothing");
                }
            case Integer i:
                System.out.println(i);
            case null:
                System.out.println("error");
            default:
                o.toString();
        }
    }*/

}
