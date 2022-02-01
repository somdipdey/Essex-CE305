grammar csv;

list
   : BEGL elems? ENDL
   ;

elems
   : elem ( SEP elem )*
   ;

elem
   : (ID|NUM)+
   ;

BEGL : '[';
ENDL : ']';
SEP  : ',';
NUM :   [0-9]+ ('.' [0-9]+)? ([eE] [+-]? [0-9]+)?;
ID  :   [a-zA-Z]+;
WS   : [ \t\r\n]+ -> skip;