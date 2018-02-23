$ ->
  $.get "/persons", (persons) ->
    $.each persons, (index, person) ->
      $("#persons").append $("<li>").text person.name
      $("#persons").append $("<li>").text person.address
      
      
      
      