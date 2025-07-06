find . -name "*.class" -type f -print

read -p "Do you want to delete these files? (y/n): " a

if [[ "$a" == "y" ]]; then
    find . -name "*.class" -type f -delete
    echo "Files deleted."
else
    echo "Operation canceled."
fi
