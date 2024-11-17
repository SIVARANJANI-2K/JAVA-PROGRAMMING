import java.util.Scanner;

public class languageDefine_3045 {
    String[][] languages={
            {"Java","pure object oriented programming language by James Gosling"},
            {"Python","An easy-to-learn language that's relevant for real-world needs."},
            {"C++","Object oriented programming language by Stroustrup"},
            {"PHP","PHP stands for Hypertext Preprocessor, and it's an open-source programming language used for web development."},
            {"SQL","SQL stands for Structured Query Language, and it was standardized in 1986 by the American National Standards Institute"},
            {"R","heavily used in statistical analytics and machine learning applications."},
            {"C","Dennis Ritchie and Brian Kernighan developed C in 1972 for programming computer operating systems."},
            {"Perl","Perl is a powerful programming language with many features and applications"},
            {"Ruby","Ruby is an open-source natural programming language that focuses on simplicity and productive use for back-end programming."},
            {"Go","Robert Griesemer, Rob Pike, and Ken Thompson designed Go at Google, and it was launched in 2009."}
    };
    public void getDefinition(String pl){
        boolean flag=false;
        for(int i=0;i<10;i++){
            if(pl.equalsIgnoreCase(languages[i][0])){
                System.out.println(languages[i][0]+" : "+languages[i][1]);
                flag=true;
                break;
            }
        }
        if(!flag){
            System.out.println("mentioned programming language is not present");
        }

    }
    public static void main(String[] args){
        System.out.println("Sivaranjani -2022503045");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the programming language:");
        String str=sc.nextLine();
        languageDefine_3045 obj=new languageDefine_3045();
        obj.getDefinition(str);
    }
}

