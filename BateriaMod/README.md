# Bateria Mod (Minecraft Java 1.20.1 / Forge)

Adiciona uma bateria musical e baquetas. Equipe as baquetas e clique com o botão direito em diferentes áreas da bateria para tocar bumbo, caixa, chimbal, tom e prato. Agachar altera o timbre/altura da batida.

## Requisitos
- Minecraft Java Edition 1.20.1
- Forge 47.2.0 ou compatível com Minecraft 1.20.1
- Java 17 para compilar

## Compilar
1. Instale Java 17 e Gradle 8.1+ (se não usar wrapper).
2. Abra um terminal nesta pasta.
3. Execute `gradle build`.
4. O arquivo será criado em `build/libs/bateriamod-1.0.0.jar`.

## Testar no jogo
Instale Forge 1.20.1, coloque o JAR em `.minecraft/mods` e inicie o perfil Forge. No criativo, procure “Bateria” e “Baquetas”.

IDs para comandos: `/give @p bateriamod:bateria` e `/give @p bateriamod:baquetas`.
