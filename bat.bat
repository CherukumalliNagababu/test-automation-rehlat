set projectLocation=D:\AugNewWorkSpace\test-automation-rehlat

cd %projectLocation%

mvn test -Dcucumber.options=src/test/resources/features/flight/english/GuestUser.feature