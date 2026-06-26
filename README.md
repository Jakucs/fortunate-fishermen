# Fortunate Fishermen

## Overview

Your assignment is to write an application that simulates a day at a fishing tournament organized by the **Fortunate Fishermen Club**.

Each participating fisherman receives a list of fishing spots to visit during the day. At each spot, catching a fish depends on luck — and when a fisherman comes up empty, they may try again. There must be a limit on reattempts, however, since there are other spots to visit and the tournament ends at sunset. Fishermen are responsible for controlling their own reattempt strategies.

Success is measured as the **rate of successful catches against the total spots visited**. At the end of the simulation, the top fisherman is announced.

---

## Example Fishermen

| Fisherman | Max reattempts per spot | Max reattempts per day |
|-----------|------------------------|------------------------|
| Frank     | 3                      | 5                      |
| Fred      | 2                      | 6                      |
| Flynn     | 5                      | 11                     |

---

## Example Output

```
Fisherman Frank caught at 7 spots out of 10: success rate 70% (0 reattempt(s) left)
Fisherman Fred caught at 5 spots out of 10: success rate 50% (0 reattempt(s) left)
Fisherman Flynn caught at 10 spots out of 10: success rate 100% (1 reattempt(s) left)
The winner is Fisherman Flynn
```

---

## Learning Goals

- Implement classes with **state and behavior**
- Create **instances of classes** and use them
- Work with **random numbers** in Java

---

## Class Structure

### `WaterZone`

Represents a fishing area in the tournament. Each zone stores descriptive geographical information.

**Fields:**

| Field      | Type     | Description                                  |
|------------|----------|----------------------------------------------|
| `name`     | `String` | The name of the water zone (e.g. "Blue Lake") |
| `type`     | `String` | Type of water body: `lake`, `river`, or `pond` |
| `region`   | `String` | The region where the zone is located          |

**Constructor:** `WaterZone(String name, String type, String region)`

---

### `FishingSpot`

Represents a specific location a fisherman visits during the tournament day.

**Fields:**

| Field        | Type        | Description                                    |
|--------------|-------------|------------------------------------------------|
| `id`         | `int`       | Unique identifier for the spot                 |
| `waterZone`  | `WaterZone` | The water zone this spot belongs to            |
| `isCaught`   | `boolean`   | Whether a fish was successfully caught here     |

**Constructor:** `FishingSpot(int id, WaterZone waterZone)`

---

### `Report`

Stores the end-of-day statistics for a fisherman and can format them as a human-readable message.

**Fields:**

| Field               | Type     | Description                                        |
|---------------------|----------|----------------------------------------------------|
| `fishermanName`     | `String` | The name of the fisherman                          |
| `successfulCatches` | `int`    | Number of spots where a fish was caught            |
| `totalSpots`        | `int`    | Total number of spots assigned for the day         |
| `reattempsLeft`     | `int`    | How many daily reattempts the fisherman has left   |

**Constructor:** `Report(String fishermanName, int successfulCatches, int totalSpots, int reattempsLeft)`

**Method:**

```java
String getSummary()
// Returns a formatted string, e.g.:
// "Fisherman Frank caught at 7 spots out of 10: success rate 70% (0 reattempt(s) left)"
```

---

### `Fisherman`

The central class containing most of the application logic. A fisherman picks up spots, spends the day trying to catch fish, and files a report at the end.

**Fields:**

| Field                  | Type                 | Description                                        |
|------------------------|----------------------|----------------------------------------------------|
| `name`                 | `String`             | The fisherman's name                               |
| `spots`                | `List<FishingSpot>`  | All spots assigned for the day                     |
| `maxReattempsPerSpot`  | `int`                | Max number of reattempts allowed per single spot   |
| `maxReattempsPerDay`   | `int`                | Max total reattempts allowed in the whole day      |
| `reattempsLeft`        | `int`                | Remaining reattempts for the day                   |
| `successfulCatches`    | `int`                | Counter of successfully caught spots               |

**Constructor:** `Fisherman(String name, int maxReattempsPerSpot, int maxReattempsPerDay)`

**Methods:**

```java
void addSpot(FishingSpot spot)
// Adds a fishing spot to the fisherman's daily list.

void doFishingDay()
// Attempts a catch at every assigned spot.
// - Each attempt has a random chance of success.
// - If a spot fails, the fisherman may reattempt it
//   (up to maxReattempsPerSpot times and within the daily limit).
// - Successfully caught spots are not revisited.

Report createReport()
// Returns a Report object built from the day's statistics.
```

---

## Simulation (`Main`)

In the `main` method:

1. Create **three `Fisherman` objects** with different reattempt strategies (see examples above).
2. Create **10 `FishingSpot` objects** per fisherman with **randomly generated `WaterZone` data**.
3. Call `doFishingDay()` on each fisherman.
4. Collect `Report` objects via `createReport()`.
5. Print each report using `getSummary()`.
6. **Compare success rates** and print the winner announcement.

---

## Criteria Checklist

| Task                          | Criterion                                                                                  |
|-------------------------------|--------------------------------------------------------------------------------------------|
| **Handling water zones**       | `WaterZone` has 3 fields and a working constructor                                        |
| **Handling fishing spots**     | `FishingSpot` has 3 fields and a working constructor                                      |
| **Handling reports**           | `Report` has necessary fields, constructor, and a `getSummary()` method                   |
| **Handling fishermen (1)**     | `addSpot()` is implemented; necessary fields are declared                                  |
| **Handling fishermen (2)**     | `doFishingDay()` attempts all spots and performs reattempts correctly                      |
| **Handling fishermen (3)**     | Successfully caught spots are not revisited                                                |
| **Handling fishermen (4)**     | Reattempts follow each fisherman's individual strategy                                     |
| **Handling fishermen (5)**     | `createReport()` builds a report from daily statistics                                     |
| **Handling fishermen (6)**     | Constructor sets all initial field values                                                  |
| **Run the simulation**         | All water zone data is randomly generated                                                  |
| **Run the simulation**         | The winning fisherman is announced on the console after the simulation                     |
