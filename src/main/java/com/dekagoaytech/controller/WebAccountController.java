package com.dekagoaytech.controller;

import com.dekagoaytech.model.*;
import jakarta.servlet.http.HttpSession;
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
        return "addAccount"; // templates/dashboard.html
    }

    @GetMapping("/payments")
    public String showPayments() {
        return "payments"; // templates/dashboard.html
    }

    @GetMapping("/transfers")
    public String showTransfers() {
        return "transfers"; // templates/dashboard.html
    }

    @GetMapping("/addAccount")
    public String addAccount(HttpSession session, Model model) {
        model.addAttribute("name",session.getAttribute("name"));
        model.addAttribute("id",session.getAttribute("idNumber"));
        return "addAccount"; // templates/dashboard.html
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
                                Model model,
                                HttpSession session) {
        session.setAttribute("name", firstName + " " + lastName);
        session.setAttribute("idNumber", idNumber);
        // For now, just redirect to dashboard after submission
        return "redirect:/addAccount";
    }
}
