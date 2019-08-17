public class Calc {
        public static void main(String args[]) {
            String a = "0-5*20-15+8";
            System.out.println(a);
            String operators[]=a.split("[0-9]+");
            String operands[]=a.split("[+-/\\*]");

            for(int i=1;i<operands.length;i++){
                if(operators[i].equals("*")){
                    int val1 = Integer.parseInt(operands[i-1]);
                    int val2 = Integer.parseInt(operands[i]);
                    operands[i-1]=Integer.toString(val1*val2);
                    operands[i]="0";
                }
                if(operators[i].equals("/"))
                {
                    int val1 = Integer.parseInt(operands[i-1]);
                    int val2 = Integer.parseInt(operands[i]);
                    operands[i-1]=Integer.toString(val1/val2);
                    operands[i]="0";
                }
            }

            int agregate = Integer.parseInt(operands[0]);
            for(int i=1;i<operands.length;i++){
                if(operators[i].equals("+"))
                    agregate += Integer.parseInt(operands[i]);
                if(operators[i].equals("-"))
                    agregate -= Integer.parseInt(operands[i]);
            }

            System.out.println(agregate);
        }
    }

