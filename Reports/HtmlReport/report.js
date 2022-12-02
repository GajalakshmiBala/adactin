$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Booking hotel room",
  "description": "",
  "id": "booking-hotel-room",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login page",
  "description": "",
  "id": "booking-hotel-room;login-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@sanityTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user launch the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user gives username",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user gives password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user clicks login",
  "keyword": "And "
});
formatter.match({
  "location": "Adactinstepdefinition.user_launch_the_URL()"
});
formatter.result({
  "duration": 5368538700,
  "status": "passed"
});
formatter.match({
  "location": "Adactinstepdefinition.user_gives_username()"
});
formatter.result({
  "duration": 760492000,
  "status": "passed"
});
formatter.match({
  "location": "Adactinstepdefinition.user_gives_password()"
});
formatter.result({
  "duration": 233649000,
  "status": "passed"
});
formatter.match({
  "location": "Adactinstepdefinition.user_clicks_login()"
});
formatter.result({
  "duration": 2389461100,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "search Hotel",
  "description": "",
  "id": "booking-hotel-room;search-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "user gives the location",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "user gives the hotel name",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user gives the room type",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user gives the Room number",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "user gives check in date",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user gives check out date",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user gives the adult per room",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user gives child per room",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user clicks search",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactinstepdefinition.user_gives_the_location()"
});
formatter.result({
  "duration": 569367900,
  "status": "passed"
});
formatter.match({
  "location": "Adactinstepdefinition.user_gives_the_hotel_name()"
});
formatter.result({
  "duration": 296710200,
  "status": "passed"
});
formatter.match({
  "location": "Adactinstepdefinition.user_gives_the_room_type()"
});
formatter.result({
  "duration": 278228700,
  "status": "passed"
});
formatter.match({
  "location": "Adactinstepdefinition.user_gives_the_Room_number()"
});
formatter.result({
  "duration": 224979500,
  "status": "passed"
});
formatter.match({
  "location": "Adactinstepdefinition.user_gives_check_in_date()"
});
formatter.result({
  "duration": 349438500,
  "status": "passed"
});
formatter.match({
  "location": "Adactinstepdefinition.user_gives_check_out_date()"
});
formatter.result({
  "duration": 301917200,
  "status": "passed"
});
formatter.match({
  "location": "Adactinstepdefinition.user_gives_the_adult_per_room()"
});
formatter.result({
  "duration": 347028100,
  "status": "passed"
});
formatter.match({
  "location": "Adactinstepdefinition.user_gives_child_per_room()"
});
formatter.result({
  "duration": 282497700,
  "status": "passed"
});
formatter.match({
  "location": "Adactinstepdefinition.user_clicks_search()"
});
formatter.result({
  "duration": 1062424200,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Select Hotel",
  "description": "",
  "id": "booking-hotel-room;select-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 19,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "user selects the hotel",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "user clicks continue button",
  "keyword": "And "
});
formatter.match({
  "location": "Adactinstepdefinition.user_selects_the_hotel()"
});
formatter.result({
  "duration": 178976400,
  "status": "passed"
});
formatter.match({
  "location": "Adactinstepdefinition.user_clicks_continue_button()"
});
formatter.result({
  "duration": 1085302800,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Book Hotel",
  "description": "",
  "id": "booking-hotel-room;book-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@IntegerationTest"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "user gives firstname",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "user gives lastname",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user gives Address",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "user gives card type",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "user gives card no",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user gives expiry date",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user gives  expiry year",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user gives ccv number",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user gives book now",
  "keyword": "Then "
});
formatter.match({
  "location": "Adactinstepdefinition.user_gives_firstname()"
});
formatter.result({
  "duration": 243077900,
  "status": "passed"
});
formatter.match({
  "location": "Adactinstepdefinition.user_gives_lastname()"
});
formatter.result({
  "duration": 204418900,
  "status": "passed"
});
formatter.match({
  "location": "Adactinstepdefinition.user_gives_Address()"
});
formatter.result({
  "duration": 319792300,
  "status": "passed"
});
formatter.match({
  "location": "Adactinstepdefinition.user_gives_card_type()"
});
formatter.result({
  "duration": 261285400,
  "status": "passed"
});
formatter.match({
  "location": "Adactinstepdefinition.user_gives_card_no()"
});
formatter.result({
  "duration": 244736300,
  "status": "passed"
});
formatter.match({
  "location": "Adactinstepdefinition.user_gives_expiry_date()"
});
formatter.result({
  "duration": 317523200,
  "status": "passed"
});
formatter.match({
  "location": "Adactinstepdefinition.user_gives_expiry_year()"
});
formatter.result({
  "duration": 591852000,
  "status": "passed"
});
formatter.match({
  "location": "Adactinstepdefinition.user_gives_ccv_number()"
});
formatter.result({
  "duration": 189157700,
  "status": "passed"
});
formatter.match({
  "location": "Adactinstepdefinition.user_gives_book_now()"
});
formatter.result({
  "duration": 5183776700,
  "status": "passed"
});
formatter.scenario({
  "line": 35,
  "name": "logout Hotel",
  "description": "",
  "id": "booking-hotel-room;logout-hotel",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 34,
      "name": "@logoutTest"
    }
  ]
});
formatter.step({
  "line": 36,
  "name": "user gives logout",
  "keyword": "Given "
});
formatter.match({
  "location": "Adactinstepdefinition.user_gives_logout()"
});
formatter.result({
  "duration": 1839887600,
  "status": "passed"
});
});