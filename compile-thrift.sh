#  This requires that you install Thrift binaries and compiler
#
#!/bin/sh

scriptDir=$(dirname $0)
includeDir=$scriptDir
thriftSrcDir=src/main/java/com/talool/api/thrift

rm -rf $thriftSrcDir
rm -rf $scriptDir/gen-cocoa

echo "*** Generating Java ***"
thrift -v -o $scriptDir -I $includeDir --gen java:java5  src/main/thrift/Error.thrift 
thrift -v -o $scriptDir -I $includeDir --gen java:java5  src/main/thrift/Core.thrift 
thrift -v -o $scriptDir -I $includeDir --gen java:java5  src/main/thrift/Activity.thrift 
thrift -v -o $scriptDir -I $includeDir --gen java:java5  src/main/thrift/Payment.thrift 
thrift -v -o $scriptDir -I $includeDir --gen java:java5  src/main/thrift/CustomerService.thrift 
thrift -v -o $scriptDir -I $includeDir --gen java:java5  src/main/thrift/Property.thrift 

echo "*** Generating Cocoa ***"
thrift -v -o $scriptDir -I $includeDir --gen cocoa src/main/thrift/Error.thrift
thrift -v -o $scriptDir -I $includeDir --gen cocoa src/main/thrift/Core.thrift
thrift -v -o $scriptDir -I $includeDir --gen cocoa src/main/thrift/Activity.thrift 
thrift -v -o $scriptDir -I $includeDir --gen cocoa src/main/thrift/Payment.thrift 
thrift -v -o $scriptDir -I $includeDir --gen cocoa src/main/thrift/CustomerService.thrift
thrift -v -o $scriptDir -I $includeDir --gen cocoa src/main/thrift/Property.thrift

echo "*** Moving $scriptDir/gen-java/* to src/main/java/. ***"
cp -r  $scriptDir/gen-java/* src/main/java/.
rm -rf $scriptDir/gen-java

