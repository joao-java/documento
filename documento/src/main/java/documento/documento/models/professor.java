    package documento.documento.models;

    import java.util.List;

    import jakarta.persistence.Column;
    import jakarta.persistence.Entity;
    import jakarta.persistence.GeneratedValue;
    import jakarta.persistence.GenerationType;
    import jakarta.persistence.Id;
    import jakarta.persistence.ManyToMany;
    import lombok.AllArgsConstructor;
    import lombok.Getter;
    import lombok.NoArgsConstructor;
    import lombok.Setter;

    @Entity
    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter

    public class professor {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        @Column(length = 200, nullable = false)
        private String nome;
        @Column(nullable = false)
        private String CPF;
        @Column(nullable = false)
        private String RG;
        @Column(nullable = false)
        private int endereco;
        @Column(nullable = false)
        private int celular;

        @ManyToMany(mappedBy = "professores")
        private List<cadastramento> cadastramentos;

        private List<professor> professores;

    }
