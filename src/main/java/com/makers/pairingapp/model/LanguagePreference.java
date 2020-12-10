package com.makers.pairingapp.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "language_preferences")
public class LanguagePreference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private ApplicationUser user;

    @ManyToOne
    @JoinColumn(name="language_id")
    private Language language;

    public LanguagePreference() {
    }

    public LanguagePreference(Long id, ApplicationUser user, Language language) {
        this.id = id;
        this.user = user;
        this.language = language;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ApplicationUser getUser() {
        return user;
    }

    public void setUser(ApplicationUser user) {
        this.user = user;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LanguagePreference that = (LanguagePreference) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "LanguagePreference{" +
                "id=" + id +
                ", user=" + user +
                ", language=" + language +
                '}';
    }
}