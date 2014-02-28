# Build and test language parser using antlr.
# install antlr using homebrew with :-
#   brew install antlr
# and then make a symbolic link to the command
#   ln -s /usr/local/Cell/antlr/4.1/bin/antlr4 /usr/local/bin
# to run antlr from the cli using ~$ antlr4

ANTLR_PATH=/usr/local/Cellar/antlr/4.1/antlr-4.1-complete.jar
TARGET=Numbers
FILE=$1

green="$(tput setaf 2)"
red="$(tput setaf 1)"
magenta="$(tput setaf 5)"
reset="$(tput setaf 7)"

echo "\nGenerating into /${magenta}"$TARGET"${reset}"
java -jar $ANTLR_PATH -o $TARGET $TARGET.g4
echo "Compiling using /${magenta}"$TARGET"${reset}"
javac -cp $ANTLR_PATH  $TARGET/*.java

if [ ! -z "$FILE" ] ; then
  echo "\nRunning test harness on "$1"...\n"
  if [ -f ./$FILE ]  ; then
    if java -cp $ANTLR_PATH:. org.antlr.v4.runtime.misc.TestRig $TARGET.$TARGET program -tree $FILE; then
      echo "\n${green}Finished with with no errors${reset}\n"
    else
      echo "\n${red}"$1" failed the TestRig \xE2\x9C\x98${reset}\n"
    fi
  else
    echo "File "$FILE" not found in current directory.\n"
  fi
else
  echo "\nNo argument supplied, no tests running."
fi

echo "\nCompiling JSONTree Package"
if javac ./JSONTree/*.java; then
  echo "${green}Success \xE2\x9C\x93${reset}"
else
  echo "${red}Failure \xE2\x9C\x98${reset}"
fi
echo "\nCompiling Calculator Package"
if javac ./Calculator/*.java; then
  echo "${green}Success \xE2\x9C\x93${reset}"
else
  echo "${red}Failure \xE2\x9C\x98${reset}"
fi
echo "\nDone.\n"
