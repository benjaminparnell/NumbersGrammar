grammar Numbers;

options {
  language = Java;
}

@header {
package numbers;
}

program
    : (expression)*
    ;

value : NUMBER;

expression : expression '*' expression #Mul
           | expression '/' expression #Div
           | expression '+' expression #Add
           | expression '-' expression #Sub
           | expression '%' expression #Mod
           | NUMBER                    #Num
           | DECIMAL                   #Dec
           | ROMANNUMERAL              #RomanNumeral
           | '(' expression ')'        #parens
           ;

STMTEND : (WS* SEMICOLON NEWLINE* | WS* NEWLINE+) -> skip;

fragment SEMICOLON
    : ';' ;
fragment NEWLINE
    :   '\r' '\n' | '\n' | '\r' ;
fragment DIGIT
    :   [0-9] ;

ROMANNUMERAL : [MDCLXVI]+ ;
WS    :   [ \t]+ -> skip ;
NUMBER : DIGIT+;
DECIMAL : DIGIT+ '.' DIGIT+ ;
OP : '+' | '-' | '*' | '/' ;
DOT : '.';
