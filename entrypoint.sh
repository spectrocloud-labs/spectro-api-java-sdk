#!/bin/bash
curl -L -O https://repo1.maven.org/maven2/io/swagger/codegen/v3/swagger-codegen-cli/3.0.43/swagger-codegen-cli-3.0.43.jar 
java -jar swagger-codegen-cli-3.0.43.jar generate -i https://raw.githubusercontent.com/spectrocloud/librarium/master/content/api/palette-apis.json -l java --api-package com.spectrocloud.client.api --model-package com.spectrocloud.client.model   --additional-properties hideGenerationTimestamp=true,java11=true  --group-id com.spectrocloud --artifact-id spectro-api-java-sdk  -o /gen
#rm -rf /gen/src/main/java/com/spectrocloud/client/model/V1ApiEndpoint.java 
find /gen -name "*.java"  | xargs sed -i -e 's/V1ApiEndpoint/V1APIEndpoint/g'
