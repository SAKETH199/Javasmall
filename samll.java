import java.util.*;
public class Main{
final static int number= 256;
static int max_distinct_char(String str, int n) {
int count[] = new int[number];
for (int i = 0; i < n; i++) {
count[str.charAt(i)]++;
}
int max_distinct = 0;
for (int i = 0; i < number; i++) {
if (count[i] != 0) {
max_distinct++;
}
}
return max_distinct;
}
static int smallesteSubstr_maxDistictChar(String str) {
int n = str.length();
int max_distinct = max_distinct_char(str, n);
int minl = n;
for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
String subs = null;
if(i<j)
subs = str.substring(i, j);
else
subs = str.substring(j, i);
int subs_lenght = subs.length();
int sub_distinct_char = max_distinct_char(subs, subs_lenght);
if (subs_lenght < minl && max_distinct == sub_distinct_char) {

minl = subs_lenght;
}
}
}
return minl;
}
public static void main(String[] args) {
String str;
Scanner sc=new Scanner(System.in);
str=sc.next();

int len = smallesteSubstr_maxDistictChar(str);
System.out.println(len);

}
}
