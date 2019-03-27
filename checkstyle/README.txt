
Checkstyle configuration files can be found under src/main/resources

1. You can edit checkstyle rules in checkstyle.xml

2. You can suppress a rule for any files in suppressions.xml

3. You can suppress a rule in a source file with comment:

// CHECKSTYLE_OFF: NameOfTheCheck|OtherTheCheck
{ code }
// CHECKSTYLE_ON: NameOfTheCheck|OtherTheCheck

