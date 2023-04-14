package javae;

interface Language {
    void getName(String name);
}

class ProgrammingLanguage implements Language{
    public void getName(String name){
        System.out.println("Programming Language: "+name);
    }
}

class Main1{
    public static void main(String [] args) {
        ProgrammingLanguage language = new ProgrammingLanguage();
        language.getName("Java");
    }
}
