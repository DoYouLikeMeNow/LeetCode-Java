// next capital password question

package temp;

public class Rough1
{
    public String[] passModify(String[] passwords)
    {
        String[] output = new String[passwords.length];
        String digits = "0123456789";

        for(int i = 0; i < passwords.length; i++)
        {
            output[i] = passwords[i];

            // rule 1
            output[i] = passwords[i].replace('s','5');
            output[i] = output[i].replace('S','5');

            // rule 2
            if(output[i].length() > 1 && output[i].length() % 2 == 1)
            {
                if(digits.contains(Character.toString(output[i].charAt(output[i].length()/2))))
                {
                    output[i] = output[i].substring(0, output[i].length()/2) + Integer.toString(2 * Integer.parseInt(Character.toString(output[i].charAt(output[i].length()/2)))) + output[i].substring(output[i].length()/2 + 1, output[i].length());
                }
            }

            // rule 3
            if(output[i].length() % 2 == 0)
            {
                if(Character.isUpperCase(output[i].toCharArray()[0]))
                {
                    output[i] = Character.toLowerCase(output[i].toCharArray()[0]) + output[i].substring(1,output[i].length());
                }

                else
                {
                    output[i] = Character.toUpperCase(output[i].toCharArray()[0]) + output[i].substring(1,output[i].length());
                }

                if(Character.isUpperCase(output[i].toCharArray()[output[i].length()-1]))
                {
                    output[i] = output[i].substring(0,output[i].length() - 1) + Character.toLowerCase(output[i].toCharArray()[output[i].length()-1]);
                }

                else
                {
                    output[i] = output[i].substring(0,output[i].length() - 1) + Character.toUpperCase(output[i].toCharArray()[output[i].length()-1]);
                }

                char temp = output[i].toCharArray()[0];
                output[i] = output[i].toCharArray()[output[i].length()-1] + output[i].substring(1,output[i].length() - 1) + temp;
            }

            // rule 4
            int start = output[i].toLowerCase().indexOf("nextcapital");
            if(start > -1)
            {
                output[i] = output[i].replaceFirst(output[i].substring(start, start + 4), new StringBuilder(output[i].substring(start, start + 4)).reverse().toString());
            }
        }

        return output;
    }
}
