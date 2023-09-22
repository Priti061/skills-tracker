package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SkillsController {
    @GetMapping
    @ResponseBody

    public String createHomePage() {
        return "<html><body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Ruby</li>" +
                "</ol>" +
                "</body></html>";


    }

    @GetMapping("/form")
    @ResponseBody

    public String createForm() {
        return "<html><body>" +
                "<form method= 'post'>" +
                "<label>Name<br/><input type = 'text' name='name'/></label><br/>" +
                "<label>My first language of choice<br/>" +
                "<select name=\"firstlang\" id=\"firstlang\">" +
                "<option value=\"Java\">Java</option>" +
                "<option value=\"JavaScript\">JavaScript</option>" +
                "<option value=\"Ruby\">Ruby</option>" +

                "</select></label><br/>" +
                "<label>My second language of choice<br/>" +
                "<select name=\"secondlang\" id=\"secondlang\">" +
                "<option value=\"Java\">Java</option>" +
                "<option value=\"JavaScript\">JavaScript</option>" +
                "<option value=\"Ruby\">Ruby</option>" +

                "</select></label><br/>" +
                "<label>My third language of choice<br/>" +
                "<select name=\"thirdlang\" id=\"thirdlang\">" +
                "<option value=\"Java\">Java</option>" +
                "<option value=\"JavaScript\">JavaScript</option>" +
                "<option value=\"Ruby\">Ruby</option>" +
                "</select></label><br />" +
                "<input type= \"submit\" value=\"Submit\" />" +
                "</body></html>";


    }

    @PostMapping("/form")
    @ResponseBody

    public String respondToFormSubmission(@RequestParam String name, @RequestParam String firstlang, @RequestParam String secondlang, @RequestParam String thirdlang) {
        return "<html><body>" +
                "<h1>" + name + "</h1>" +
                //"<ol>" +
                //"<li>" + firstlang + "</li>" +
                //"<li>" + secondlang + "</li>" +
                //"<li>" + thirdlang + "</li>" +
               // "</ol>" +
                //"</body></html>";
        // BONUS MISSION
        "<table>" +
                "<tr><th>First Language</th><th>SecondLanguage</th><th>Third Language</th></tr>"+
                "<tr><td>" + firstlang + "</td><td>" + secondlang + "</td><td>" + thirdlang + "</td></tr>" +
                "</table>" + "</body></html>";

    }
}


