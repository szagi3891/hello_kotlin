set -e

echo "remove ..."
rm -f main.jar

echo "compile ..."
kotlinc main.kt -include-runtime -d main.jar

echo "run ..."
echo ""
echo ""

java -jar main.jar

echo ""
echo ""


