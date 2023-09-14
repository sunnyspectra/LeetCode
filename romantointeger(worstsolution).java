class Solution {
    public int romanToInt(String s) {
       int sum = 0;
       if(s.length()<=1){
           if(s.charAt(0)=='I'){
               sum+=1;
           }
           else if(s.charAt(0)=='V'){
               sum+=5;
           }
           else if(s.charAt(0)=='X'){
               sum+=10;
           }
          else if(s.charAt(0)=='L'){
               sum+=50;
           }
           else if(s.charAt(0)=='C'){
               sum+=100;
           }
           else if(s.charAt(0)=='D'){
               sum+=500;
           }
           else if(s.charAt(0)=='M'){
               sum+=1000;
           }
           else{
               sum+=0;
           }
        
       }
        for(int i = 0 ; i<s.length()-1 ; i++){
            if(s.charAt(i)=='I'){
                if(s.charAt(i+1)=='V'){
                   sum+=4;
                    i++;
                }
                else if(s.charAt(i+1)=='X'){
                    sum+=9;
                    i++;
                }
                else{
                    sum+=1;
                }
            }
            else if(s.charAt(i)=='X'){
                if(s.charAt(i+1)=='L'){
                    sum+=40;
                    i++;
                }
                else if(s.charAt(i+1)=='C'){
                    sum+=90;
                    i++;
                }
                else{
                    sum+=10;
                }
            }
            else if(s.charAt(i)=='C'){
                if(s.charAt(i+1)=='D'){
                    sum+=400;
                    i++;
                }
                else if(s.charAt(i+1)=='M'){
                    sum+=900;
                    i++;
                }
                else {
                    sum+=100;
                }
            }
            else if(s.charAt(i)=='V'){
                sum+=5;
            }
            else if(s.charAt(i)=='L'){
                sum+=50;
            }
            else if(s.charAt(i)=='D'){
                sum+=500;
            }
            else{
                sum+=1000;
            }
        }

       
       if(s.length()>1){
           char sec = s.charAt(s.length()-2);
            char lastchar = s.charAt(s.length()-1);
            if(lastchar=='I'){
                sum+=1;
            }
            else if(lastchar == 'V'){
                if(sec=='I'){
                    sum+=0;
                }
                else{
                    sum+=5;
                }
            }
            else if(lastchar == 'X'){
                if(sec=='I'){
                    sum+=0;
                }
                else{
                sum+=10;
                }
            }
            else if(lastchar == 'L'){
                if(sec=='X'){
                    sum+=0;
                }
                else{
                sum+=50;
                }
            }
            else if(lastchar == 'C'){
                if(sec=='X'){
                    sum+=0;
                }
                else{
                sum+=100;
                }
            }
            else if(lastchar == 'D'){
                if(sec=='C'){
                    sum+=0;
                }
                else{
                sum+=500;
                }
            }
            else if(lastchar == 'M'){
                if(sec=='C'){
                    sum+=0;
                }
                else{
                sum+=1000;
                }
            }

        }

        return sum;
    }
}
