package com.dekagoaytech.controller;

import com.dekagoaytech.model.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class WebAccountController {

    // Home page
    @GetMapping("/")
    public String showHome() {
        return "index"; // templates/index.html
    }

    // Login page
    @GetMapping("/login")
    public String showLogin() {
        return "login"; // templates/login.html
    }

    // Open Account page
    @GetMapping("/openAccount")
    public String openAccount() {
        return "openAccount"; // templates/openAccount.html
    }

    // Dashboard page
    @GetMapping("/dashboard")
    public String showDashboard() {
        return "dashboard"; // templates/dashboard.html
    }

    // Account creation form submission
    @PostMapping("/create-account")
    public String createAccount(@RequestParam String accountType,
                                @RequestParam String firstName,
                                @RequestParam String lastName,
                                @RequestParam String email,
                                @RequestParam String phone,
                                @RequestParam String dob,
                                @RequestParam("idNumber") String idNumber,
                                @RequestParam String address,
                                @RequestParam String city,
                                @RequestParam String zip,
                                @RequestParam long initialDeposit,
                                Model model) {

        // For now, just redirect to dashboard after submission
        return "redirect:/dashboard";
    }
}
