# Numbers Grammar

A simple calculator using ANTLR. Supports:

* Integers
* Doubles
* Roman Numerals
* Brackets (nested)

## Running it.

Check the ANTLR_PATH variable in the build_parser.sh file is set to the correct
ANTLR path for your system.

This program requires:

* [Java 1.8](https://jdk8.java.net/download.html)
* [ANTLR 4.2](https://github.com/antlr/antlr4)

Then run the build script. This script also compiles the packages in this
project (`Calculator` and `JSONTree`), so you don't need to do that.

`sh build_parser.sh`

Once that completes successfully, run these commands to run the `Calculator`
and `JSONTree` packages respectively.

`java Calculator.Calculator`
`java JSONTree.JSONTreeCreator`

The commands will then wait on STDIN. Use <EOF> character (ctrl-d) to terminate.
You will then see output! Woot!

## Windows?

Nope.


## JSONTree?

The JSONTree package is capable of generating a valid JSON object for this
grammar, _currently outputting with indents_.