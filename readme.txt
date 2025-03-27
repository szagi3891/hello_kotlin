
brew install kotlin

///////brew install openjdk

instalacja gotowej binarki:
https://adoptium.net/



manager wersji
https://sdkman.io/

sdk list kotlin
sdk install kotlin 2.1.20
sdk list java
sdk install java 23.0.1-open


------------------

Edytor JBrains:
👉 https://www.jetbrains.com/idea/download/
Zainstaluj wersję Community (jest darmowa)

------------------

VSC jest problematyczny w konfiguracji:

rozszerzenia do vsc

Kotlin      - https://marketplace.visualstudio.com/items?itemName=fwcd.kotlin
Code Runner - https://marketplace.visualstudio.com/items?itemName=formulahendry.code-runner


Kotlin Language - do LSP - podświetlanie kodu i autouzupełnianie

Kotlin Languace Server

git clone https://github.com/fwcd/kotlin-language-server.git
cd kotlin-language-server
./gradlew installDist



