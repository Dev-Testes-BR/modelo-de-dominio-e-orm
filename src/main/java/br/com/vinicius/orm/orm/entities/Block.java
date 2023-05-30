package br.com.vinicius.orm.orm.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_block")
public class Block {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "start_block", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private LocalDate start;
    @Column(name = "end_block", columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private LocalDate end;

    @ManyToOne
    @JoinColumn(name = "activity_id")
    private Activity activity;

    public Block() {
    }

    public Block(Integer id, LocalDate start, LocalDate end) {
        this.id = id;
        this.start = start;
        this.end = end;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getAnd() {
        return end;
    }

    public void setAnd(LocalDate end) {
        this.end = end;
    }
}
