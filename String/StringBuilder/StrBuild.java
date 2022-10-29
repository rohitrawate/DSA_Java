public class StrBuild {
    public static void main(String[] args) {

        StringBuilder ans = StrBuild.a_z();
              System.out.println("Anwer : "+ ans);
    }   
        static StringBuilder a_z()
        {
            StringBuilder builder = new StringBuilder();
            System.out.println(" String Builder : "+ builder );  // empty  build.length() => 0
            for (int i = 0; i < 26; i++) {
                char ch = (char)('A' + i);     
                builder.append(ch);
            }

            System.out.println("\n " + builder);      
            System.out.println("\n " + builder.reverse());      
            // System.out.println("\n " + builder.append(true));

            return builder;
        }


           
}
