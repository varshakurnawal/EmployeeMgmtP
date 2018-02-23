(function() {
  $(function() {
    return $.get("/persons", function(persons) {
      return $.each(persons, function(index, person) {
        $("#persons").append($("<li>").text(person.name));
        return $("#persons").append($("<li>").text(person.address));
      });
    });
  });

}).call(this);

//# sourceMappingURL=index.js.map
