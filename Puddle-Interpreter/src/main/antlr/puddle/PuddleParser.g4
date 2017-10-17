/**
 * Kotlin language Antl4 grammar
 * based on Kotlin's official grammar https://kotlinlang.org/docs/reference/grammar.html
 */


parser grammar PuddleParser;

options { tokenVocab=PuddleLexer; }

puddleFile: topLevelObject* main topLevelObject*;

main:
;

topLevelObject
    : variableDeclaration
    | functionDeclaration
    | classDeclaration
    | objectDeclaration
    ;

variableObject:
    SimpleName
    ;

variableDeclaration
    : KEYWORD_var variableObject
    | KEYWORD_var variableObject EQ = variableObject
    ;