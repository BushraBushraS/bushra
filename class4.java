class class4{
    public static void main(String args[]){
	  boolean y= true;
	  System.out.println("The char is " +y);
	    System.out.printf("The char is %b\n ",y);
		}
		}
		
Microsoft Windows [Version 10.0.26200.7840]
(c) Microsoft Corporation. All rights reserved.

C:\Users\Shaik Zameer>javac class1.java
error: file not found: class1.java
Usage: javac <options> <source files>
use --help for a list of possible options

C:\Users\Shaik Zameer>cd sunjavastars

C:\Users\Shaik Zameer\sunjavastars>md sunjavastars

C:\Users\Shaik Zameer\sunjavastars>dir
 Volume in drive C is OS
 Volume Serial Number is 0628-2097

 Directory of C:\Users\Shaik Zameer\sunjavastars

24-02-2026  22:46    <DIR>          .
24-02-2026  22:37    <DIR>          ..
24-02-2026  21:56               118 check.txt
24-02-2026  22:46    <DIR>          sunjavastars
               1 File(s)            118 bytes
               3 Dir(s)  50,372,775,936 bytes free

C:\Users\Shaik Zameer\sunjavastars>javac class1.java
error: file not found: class1.java
Usage: javac <options> <source files>
use --help for a list of possible options

C:\Users\Shaik Zameer\sunjavastars>javac class1.java
error: file not found: class1.java
Usage: javac <options> <source files>
use --help for a list of possible options

C:\Users\Shaik Zameer\sunjavastars>dir
 Volume in drive C is OS
 Volume Serial Number is 0628-2097

 Directory of C:\Users\Shaik Zameer\sunjavastars

24-02-2026  22:46    <DIR>          .
24-02-2026  22:37    <DIR>          ..
24-02-2026  21:56               118 check.txt
24-02-2026  22:46    <DIR>          sunjavastars
               1 File(s)            118 bytes
               3 Dir(s)  50,369,986,560 bytes free

C:\Users\Shaik Zameer\sunjavastars>javac class1.java
error: file not found: class1.java
Usage: javac <options> <source files>
use --help for a list of possible options

C:\Users\Shaik Zameer\sunjavastars>notepad class1.java

C:\Users\Shaik Zameer\sunjavastars>D:

D:\>cd sunjavastars

D:\sunjavastars>md sunjavastars

D:\sunjavastars>dir
 Volume in drive D is New Volume
 Volume Serial Number is 645A-A059

 Directory of D:\sunjavastars

24-02-2026  22:49    <DIR>          .
24-02-2026  22:33               405 bush.class
24-02-2026  22:36                92 bush.java
24-02-2026  22:46               433 class1.java
24-02-2026  22:35               405 shif.class
24-02-2026  22:35               103 shif.java
24-02-2026  22:49    <DIR>          sunjavastars
               5 File(s)          1,438 bytes
               2 Dir(s)  237,657,563,136 bytes free

D:\sunjavastars>javac class1.java

D:\sunjavastars>java class1
The byte value is 127
The short value is 32767
The int  value is 2147483647
The long value is 4254564284

the byte value is 127
D:\sunjavastars>javac class2.java
class2.java:12: error: illegal start of expression
          System.out.println("the float value is %e",)z;
                                                     ^
class2.java:12: error: ';' expected
          System.out.println("the float value is %e",)z;
                                                      ^
2 errors

D:\sunjavastars>javac class2.java
class2.java:12: error: illegal start of expression
          System.out.println("the float value is %e",)z;
                                                     ^
class2.java:12: error: ';' expected
          System.out.println("the float value is %e",)z;
                                                      ^
2 errors

D:\sunjavastars>javac class2.java
class2.java:4: error: incompatible types: possible lossy conversion from double to float
          float y=4.5;
                  ^
1 error

D:\sunjavastars>javac class2.java

D:\sunjavastars>java class2
the float value is 3.430000the float value is 3.43000the float value is 3.430000e+00
the float value is 5.500000the float value is 5.50000the float value is 5.500000e+00
D:\sunjavastars>javac class4.java
class4.java:4: error: cannot find symbol
          System.out.println("The char is " +y);
                                             ^
  symbol:   variable y
  location: class class4
class4.java:5: error: cannot find symbol
            System.out.printf("The char is %b\n " +y);
                                                   ^
  symbol:   variable y
  location: class class4
2 errors

D:\sunjavastars>javac class4.java

D:\sunjavastars>java class4
The char is true
The char is Exception in thread "main" java.util.MissingFormatArgumentException: Format specifier '%b'
        at java.base/java.util.Formatter.format(Formatter.java:2760)
        at java.base/java.io.PrintStream.format(PrintStream.java:1183)
        at java.base/java.io.PrintStream.printf(PrintStream.java:1081)
        at class4.main(class4.java:5)

D:\sunjavastars>javac class4.java
class4.java:5: error: ')' or ',' expected
            System.out.printf("The char is %b\n " y);
                                                 ^
class4.java:5: error: not a statement
            System.out.printf("The char is %b\n " y);
                                                  ^
class4.java:5: error: ';' expected
            System.out.printf("The char is %b\n " y);
                                                   ^
class4.java:9: error: class, interface, annotation type, enum, record, method or field expected
    }
    ^
4 errors

D:\sunjavastars>javac class4.java
class4.java:5: error: ')' or ',' expected
            System.out.printf("The char is %b\n " y);
                                                 ^
class4.java:5: error: not a statement
            System.out.printf("The char is %b\n " y);
                                                  ^
class4.java:5: error: ';' expected
            System.out.printf("The char is %b\n " y);
                                                   ^
3 errors

D:\sunjavastars>javac class4.java

D:\sunjavastars>java class4
The char is true
The char is true

D:\sunjavastars>