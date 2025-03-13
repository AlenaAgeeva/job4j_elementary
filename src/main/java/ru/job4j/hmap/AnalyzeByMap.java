package ru.job4j.hmap;

import java.util.*;
import java.util.stream.Collectors;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int sum = 0;
        int subjectsNum = 0;
        for (Pupil p : pupils) {
            subjectsNum += p.subjects().size();
            for (Subject s : p.subjects()) {
                sum += s.score();
            }
        }
        return (double) sum / subjectsNum;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> label = new ArrayList<>();
        int avScore = 0;
        for (Pupil p : pupils) {
            for (Subject s : p.subjects()) {
                avScore += s.score();
            }
            label.add(new Label(p.name(),
                    (double) avScore / p.subjects().size()));
            avScore = 0;
        }
        return label;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Integer> totalScores = getMapLabels(pupils);
        return totalScores.entrySet().stream()
                .map(entry -> new Label(entry.getKey(), (double) entry.getValue() / pupils.size()))
                .collect(Collectors.toList());
    }

    private static Map<String, Integer> getMapLabels(List<Pupil> pupils) {
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Pupil p : pupils) {
            for (Subject s : p.subjects()) {
                map.merge(s.name(), s.score(), Integer::sum);
            }
        }
        return map;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> label = new ArrayList<>();
        int avScore = 0;
        for (Pupil p : pupils) {
            for (Subject s : p.subjects()) {
                avScore += s.score();
            }
            label.add(new Label(p.name(), avScore));
            avScore = 0;
        }
        label.sort(Comparator.naturalOrder());
        return label.get(label.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> subjectScores = getMapLabels(pupils);
        return subjectScores.entrySet()
                .stream()
                .map(entry -> new Label(entry.getKey(), entry.getValue().doubleValue()))
                .max(Comparator.naturalOrder())
                .orElseThrow(() -> new NoSuchElementException("No subjects found"));
    }
}
