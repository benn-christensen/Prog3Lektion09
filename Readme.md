# Opgave 01 - Factory Method (RPG Character Builder)

I denne opgave skal I refaktorere eksisterende kode til at bruge **Factory Method**.

Startkoden er bevidst lavet med en switch-baseret loesning, som **ikke** bruger Factory Method.

## Domane

I udvikler en RPG character builder.

En karakter har:
- en `CharacterType` (f.eks. `WARRIOR`, `WIZARD`, `ROGUE`)
- et passende våben (f.eks. `Sword`, `Staff`, `Dagger`)

## Startkode (uden Factory Method)

Startkoden findes i `src/opgave01` og bruger:
- `enum CharacterType`
- en `switch` i `CharacterBuilder.createCharacter(...)`
- direkte instansiering med `new Sword()`, `new Staff()`, osv.

Det betyder, at klientkoden stadig er tæt koblet til konkrete våbenklasser via builder-logikken.

## Hvorfor er startkoden et problem?

Den nuværende løsning virker, men den giver hurtigt problemer når systemet vokser:

- **Tæt kobling:** `CharacterBuilder` kender alle konkrete våbenklasser (`Sword`, `Staff`, `Dagger`).
- **Bryder Open/Closed Principle:** Hver gang I tilføjer en ny type (f.eks. `RANGER`), skal I ændre eksisterende `switch`-kode.
- **Mere fejlrisiko:** Mange `switch`-grene i samme metode giver større risiko for fejl og glemte cases.
- **Sværere at teste isoleret:** Oprettelseslogik og flowlogik er blandet sammen.

Konsekvensen er, at koden bliver tungere at vedligeholde over tid.

## Hvorfor Factory Method?

Factory Method flytter ansvaret for objekt-oprettelse fra klientkoden over i dedikerede creator-klasser.

Det giver jer:

- **Bedre ansvarsfordeling:** `Main`/klientkode fokuserer paa brug, ikke konstruktion.
- **Nem udvidelse:** Nye karakterklasser kan tilføjes med nye creators/produkter uden at omskrive eksisterende logik.
- **Mindre kobling:** Klientkode arbejder mod abstraktioner som `Weapon`.
- **Mere testbar kode:** Hver creator kan testes separat.

## Opgave

Refaktorer loesningen til at bruge **Factory Method pattern**.

### Krav

- Brug engelske klassenavne og symbolnavne i kode.
- Behold `enum CharacterType`.
- Fjern switch-baseret oprettelse af konkrete vaaben fra klientkoden.
- Indfoer Product-abstraktion (`Weapon`).
- Indfoer Creator-abstraktion (f.eks. `CharacterClass` eller `CharacterCreator`) med en factory method som opretter `Weapon`.
- Lav mindst to concrete creators (f.eks. `WarriorClass` og `WizardClass`) med tilhoerende konkrete produkter.
- `Main` ma kun arbejde mod abstraktioner saa vidt muligt.

### Minimum leverance

- Stoette for mindst disse typer:
  - `WARRIOR` -> `Sword`
  - `WIZARD` -> `Staff`
- Koerbart eksempel fra `Main` der udskriver mindst to oprettede karakterer.

### Bonus

- Tilfoej `RANGER` med et passende vaaben uden at skulle aendre i eksisterende creator-klasser.
- Tilfoej en kort test/validering der viser, at korrekt vaaben bliver oprettet per karaktertype.

## Hvad vi kigger efter

- Korrekt brug af Factory Method roller (Product, Creator, ConcreteProduct, ConcreteCreator)
- Mindre kobling i klientkoden end i startloesningen
- Laesbar og velstruktureret kode

# Opgave 02 - Decorator (Coffee Shop)

Implementer `CondimentDecorator` klasserne `Milk`, `Mocha`, `Soy` og `Whip`. Se klassediagrammet på side 92 i bogen.

Tillægspriserne er:

| Condiment | Price |
| :--- | :--- |
| Milk | .10 |
| Mocha | .20 |
| Soy | .15 |
| Whip | .10 |

Se om du kan lave opgaven uden at se på løsningen side 97.

# Opgave 03 - Decorator (Sieve of Eratosthenes)

Metoden `findPrimeNumbers` i klassen `SieveOfEratosthenes` finder primtal og udskriver de sidste 100. Men den måler også tidsforbrug, hvilket ikke har så meget med primtal at gøre.

Brug decorator pattern til at flytte tidsmålingen ud af metoden.
