/* To run main.antlr and generate the listeners and parsers
** run this in console:
** java -cp "c:\full path to jar\main.antlr-4.7-complete.jar" org.main.antlr.v4.Tool Puddle.g4
** Kenji: java -cp lib\antlr-4.7-complete.jar org.antlr.v4.Tool src\main\antlr\Puddle.g4
*/

grammar Puddle;

main:	(expr NEWLINE)* ;
expr:	expr ('*'|'/') expr
    |	expr ('+'|'-') expr
    |	INT
    |	'(' expr ')'
    ;
NEWLINE : [\r\n]+ ;
INT     : [0-9]+ ;