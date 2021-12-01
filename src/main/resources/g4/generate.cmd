:: Copyright 2019 Association for the promotion of open - source insurance software and for the establishment of open interface standards in the insurance industry
::
:: Licensed under the Apache License, Version 2.0 (the "License");
:: you may not use this file except in compliance with the License.
:: You may obtain a copy of the License at
::
:: http ://www.apache.org/licenses/LICENSE-2.0
::
:: Unless required by applicable law or agreed to in writing, software
:: distributed under the License is distributed on an "AS IS" BASIS,
:: WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
:: See the License for the specific language governing permissions and
:: limitations under the License.
:: to use prepare dir libraries with jar for latest release then run
:: generate.cmd \libraries\antlr-4.9.3-complete.jar
if *%1*==** goto error

:begin
java -jar %1 -listener -visitor -o ../../java/mx/zurich/demo/rating/engine/ -package mx.zurich.demo.rating.engine RatingEngine.g4
goto end

:error
echo generate.cmd <path to antlr jar file>
goto end

:end
